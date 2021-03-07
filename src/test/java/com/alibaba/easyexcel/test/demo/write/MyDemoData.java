package com.alibaba.easyexcel.test.demo.write;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class MyDemoData {
    @ExcelProperty(value = "字符串标题",order = 1)
    private String string;
    @ExcelProperty(value = "日期标题",order = 3)
    private Date date;
    @ExcelProperty(value = "数字标题",order = 4)
    private Double doubleData;
    @ExcelProperty(value = "字段1",order = 2)
    private String s1;
    @ExcelProperty(value = "字段2",order = 6)
    private String s2;
    @ExcelProperty(value = "字段3",order = 5)
    private String s3;
    @ExcelProperty(value = "字段4",order = 7)
    private String s4;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
