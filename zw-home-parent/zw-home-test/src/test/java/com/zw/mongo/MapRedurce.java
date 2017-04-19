package com.zw.mongo;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: java
 * \* Date: 2017/4/19
 * \* Time: 16:15
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class MapRedurce {
    public static void main(String[] args) {
        Mongo mongo;

        try {
            mongo = new MongoClient("192.168.126.49", 20000);
            DB db = mongo.getDB("zw");
            DBCollection books = db.getCollection("books");

            String map = "function() { "+
                    "var category; " +
                    "if ( this.pages >= 250 ) "+
                    "category = 'Big Books'; " +
                    "else " +
                    "category = 'Small Books'; "+
                    "emit(category, {name: this.name});}";

//            String reduce = "function(key, values) { " +
//                    "var sum = 0; " +
//                    "values.forEach(function(doc) { " +
//                    "sum += 1; "+
//                    "}); " +
//                    "return {books: sum};} ";]

            String reduce = "function (key, values) {"+
                "var sum = 0;"+
                "values.forEach(function (value, index, array) {"+
                    "sum += value.name;" +
                    "sum += ',';" +
                "});" +
                "return sum.substr(0,sum.length-1);" +
            "};";


            MapReduceCommand cmd = new MapReduceCommand(books, map, reduce, null, MapReduceCommand.OutputType.INLINE, null);

            MapReduceOutput output = books.mapReduce(cmd);

            MapReduceOutput output1 = books.mapReduce(map, reduce, "book_res", null);

            for (DBObject dbObject : output.results()) {
                System.out.println(dbObject.toString());
            }


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}