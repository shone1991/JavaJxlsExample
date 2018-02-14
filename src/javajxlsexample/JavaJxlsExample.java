/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxlsexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

/**
 *
 * @author LapasovFG.VCRP
 */
public class JavaJxlsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        try(InputStream is = org.jxls.demo.guide.ObjectCollectionDemo.class.getResourceAsStream("object_collection_template.xls")) {
//        try(InputStream is = new FileInputStream(new File("input.xls"));) {
//        Files.newInputStream(Paths.get(srcFilePath))
//        try(InputStream is = JavaJxlsExample.class.getResourceAsStream("input.xls");) {
        try(InputStream is = Files.newInputStream(Paths.get("input.xls"));) {
        try (OutputStream os = new FileOutputStream("output.xls")) {
            Employee e1=new Employee("a", 21, 3000);
            Employee e2=new Employee("b", 25, 6000);
            Employee e3=new Employee("c", 28, 9000);
            List<Employee> employees=new ArrayList();
            employees.add(e1);
            employees.add(e2);
            employees.add(e3);
            Context context = new Context();
            context.putVar("employees", employees);
            JxlsHelper.getInstance().processTemplate(is, os, context);
        }   catch (FileNotFoundException ex) {
                Logger.getLogger(JavaJxlsExample.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
}
