package com.sunny;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tec_feng
 * @create 2020-04-27 12:48
 */
public class GeneratorCustomCode {
    private static String projectFolder  = System.getProperty("user.dir");
    private static String separator = System.getProperty("file.separator");
    public static void main(String[] args) {
        //类名称
        String classNames = "CategoryParameter;CategoryProperty;ProductCategoryParameterValue;" +
                "ProductCategoryPropertyValue";
        for(String className:classNames.split(";")){
            autoGeneratorCode(className);
        }
    }
    private static void autoGeneratorCode(String className){
        String model = "product";
        System.out.println("自动创建开始...");
        autoGeneratorCode(model,className,"service","Service");
        System.out.println("创建Service成功...");
        autoGeneratorCode(model,className,"action","Action");
        System.out.println("创建Action成功...");
        System.out.println("自动创建结束...");
    }

    private static void autoGeneratorCode(String model,String className,String packageName
    ,String serviceName){
        StringBuilder prePath = new StringBuilder(projectFolder);
        prePath.append(separator).append("shop-service").append(separator)
                .append("shop-service-").append(model).append(separator);
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        String templatePath = prePath.toString() +"src/main/resources/template";
        String classPath = prePath.toString() +"src/main/java/com/sunny/shop/"+packageName;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(templatePath));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("createTime", new Date());
            dataMap.put("UpperClassName", className);
            dataMap.put("lowerClassName", toLowerCaseFirstOne(className));
            dataMap.put("model",model);
            // step4 加载模版文件
            Template template = configuration.getTemplate(serviceName+".ftl");
            // step5 生成数据
            File docFile = new File(classPath + "\\" + className+serviceName+ ".java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public static String toLowerCaseFirstOne(String s){
        if(Character.isLowerCase(s.charAt(0))) {
            return s;
        }else{
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }}
}
