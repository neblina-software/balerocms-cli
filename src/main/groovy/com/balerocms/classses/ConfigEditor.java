/**
 * Balero CMS Project: Proyecto 100% Mexicano de código libre.
 * Página Oficial: http://www.balerocms.com
 *
 * @author Anibal Gomez <anibalgomez@icloud.com>
 * @copyright Copyright (C) 2016 (2/26/16) ) Neblina Software. Derechos reservados.
 * @license Licencia BSD; vea LICENSE.txt
 */

package com.balerocms.classses;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigEditor {

    private static final Logger log = LogManager.getLogger(ConfigEditor.class.getName());

   public void setProperty(String property, String newValue) throws IOException {
       FileInputStream in = new FileInputStream(System.getProperty("user.dir") + "/updates/test/application.properties");
       Properties props = new Properties();
       props.load(in);
       in.close();

       FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "/updates/test/application.properties");
       props.setProperty(property, newValue);
       props.store(out, null);
       out.close();
   }

    public String getProperty(String property) throws IOException {
        String value = null;
        FileInputStream in = new FileInputStream(System.getProperty("user.dir") + "/updates/test/application.properties");
        Properties props = new Properties();
        props.load(in);
        value = props.getProperty(property);
        in.close();
        return value;
    }

}
