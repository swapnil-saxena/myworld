package com.trynpray.app.spark_app;

import org.apache.spark.sql.*;
//import org.apache.spark.sql.SparkSession$Builder;
//import org.apache.spark.sql.SparkSession.Builder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SparkSession spark= SparkSession.builder().appName("My Spark App").master("local").getOrCreate();
       spark.range(10).toDF().show();  
      // SparkSession.SparkSession$Builder
    }
}
