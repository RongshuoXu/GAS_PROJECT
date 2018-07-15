package com.springMVC.Util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelExportUtils {
    public static synchronized void ExportExcel(String sheetName, String[] headers, List<Object[]> data, OutputStream out){
        //声明一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //生成一个表格
        HSSFSheet sheet = workbook.createSheet(sheetName);
        //设置表格默认列宽度为15个字符
        sheet.setDefaultColumnWidth(20);
        /* 生成一个样式，用来设置标题样式 */
        HSSFCellStyle style = workbook.createCellStyle();
        //设置这些样式
//            style.setBorderBottom(BorderStyle.THIN);
//            style.setBorderLeft(BorderStyle.THIN);
//            style.setBorderRight(BorderStyle.THIN);
//            style.setBorderTop(BorderStyle.THIN);
//            style.setAlignment(HorizontalAlignment.CENTER_SELECTION);
//            style.setFillForegroundColor(HSSFColor.HSSFColorPredefined.SKY_BLUE.getIndex());
//            style.setFillPattern(FillPatternType.ALT_BARS);
        //生成一个字体
        HSSFFont font = workbook.createFont();
        font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
        font.setBold(true);
        font.setFontHeight((short)300);
        //把字体应用到当前的样式
        style.setFont(font);

        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setVerticalAlignment(VerticalAlignment.CENTER);
        style2.setAlignment(HorizontalAlignment.CENTER);

        //产生表格标题行
        HSSFRow row = sheet.createRow(0);
        row.setHeight((short)400);
        for(int i = 0; i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(style);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        for (int i=0;i<data.size();i++) {
            row = sheet.createRow(i+1);
            for(int j = 0 ; j< data.get(i).length; j ++) {
                HSSFCell cell =row.createCell(j);
                cell.setCellStyle(style2);
                cell.setCellValue(String.valueOf(data.get(i)[j]));

            }
        }
        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        OutputStream  ops= new FileOutputStream("E:/aaa.xls");
        String[] heades= {"c","a","b","gg",};
        List<Object[]> list = new ArrayList<>();
        String [] arr = {"1","2","3","3"};
        list.add(arr);
        ExportExcel("测试",heades,list,ops);

    }

}

