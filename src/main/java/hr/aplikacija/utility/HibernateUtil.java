/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.aplikacija.utility;

import hr.aplikacija.start.Start;
import java.io.File;
import java.net.URL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Dominik
 */
public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;
    //private static Session session;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                try {
                    URL jarPath = Start.class.getProtectionDomain().
                            getCodeSource().getLocation();
                    System.out.println(jarPath);
                    String jarDir = new File(jarPath.toString()).getParent();
                    System.out.println(jarDir);
                    File hcfgFile = new File(jarDir
                            + File.separator + "hibernate.cfg.xml");
                    System.out.println(hcfgFile);
                    Configuration cfg = new Configuration().configure(hcfgFile);
                    StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
                    sb.applySettings(cfg.getProperties());
                    StandardServiceRegistry standardServiceRegistry = sb.build();
                    sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);

                } catch (Exception e) {
                    System.out.println("===================");
                    e.printStackTrace();
                    System.out.println("===================");
                }

                // Create registry
                registry = new StandardServiceRegistryBuilder().configure().build();
                // Create MetadataSources
                MetadataSources sources = new MetadataSources(registry);
                // Create Metadata
                Metadata metadata = sources.getMetadataBuilder().build();
                // Create SessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
                //session=sessionFactory.openSession();

            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        //return session;
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }

}
