package com.springMVC.controller;
//这个是下载下来的maven包里面的类路径
import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.record.formula.functions.Cell;
import org.apache.poi.hssf.record.formula.functions.Row;
//这个是我根据idea提示alt+回车修改的类路径
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//这个是你原来本地包的类路径

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ExportController {
    @RequestMapping("/exportExcel")
    @ResponseBody
    public void ExportExcel(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sequence", "0001");
        map.put("date", "2018/01/04");
        map.put("chetaihao", "1#");
        map.put("productName", "产品名称");
        map.put("specification", "规格");
        map.put("memo", "备注");
        map.put("inspectRecordBizList", "一个list");

        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("测试表");
        HSSFRow row = sheet.createRow(0);
        int i = 0;
        for(String key : map.keySet()){
            HSSFCell cell = row.createCell((short) i);
            cell.setCellValue((String) map.get(key));
            i++;
        }
        OutputStream fos = null;
        try {
            fos = response.getOutputStream();
            String userAgent = request.getHeader("USER-AGENT");
            String fileName = "test";
            try {
                if(userAgent.equals("Mozilla")){
                    fileName = new String(fileName.getBytes(), "ISO8859-1");
                }else {
                    fileName = URLEncoder.encode(fileName, "utf8");
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/vnd.ms-excel;charset=utf-8");// 设置contentType为excel格式
            response.setHeader("Content-Disposition", "Attachment;Filename="+ fileName+".xls");
            wb.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
