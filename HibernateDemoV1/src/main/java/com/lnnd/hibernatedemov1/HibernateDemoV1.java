/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lnnd.hibernatedemov1;

import com.lnnd.pojo.Category;
import com.lnnd.pojo.Product;
import com.lnnd.repository.ProductRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemoV1 {
    public static void main(String[] args){
//        try(Session session = HibernateUtils.getFactory().openSession()){
//                Query q = session.createQuery("From Category");
//                List<Category> cates = q.getResultList();
//                cates.forEach(p -> System.out.println(p.getName()));
//        } 
          Map<String, String> params = new HashMap<>();
          params.put("kw", "Galaxy");  

          ProductRepository p = new ProductRepository();
          p.getProducts(params).forEach(pro -> System.out.printf("%d - %s\n",pro.getId(), pro.getName() ));
    }
}
