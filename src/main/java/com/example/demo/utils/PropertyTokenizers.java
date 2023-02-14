package com.example.demo.utils;

import org.apache.ibatis.reflection.property.PropertyTokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 字符分词。用途：字符串中获取字段名称与下标
 *
 * @author: zhangguofen
 * @date: 2023/1/13 17:43
 */
public class PropertyTokenizers {

    private final List<Result> results=new ArrayList<>();

    public List<Result> getResults() {
        return results;
    }

    public void tokenizer(String property){
        //clear
        this.results.clear();

        PropertyTokenizer helper=new PropertyTokenizer(property);
        addToResults(helper);

        //next
        while (helper.hasNext()){
            helper=helper.next();
            addToResults(helper);
        }
    }

    public void showAllResults(){
        results.forEach(System.out::println);
        System.out.println("-----");
    }

    private void addToResults(PropertyTokenizer next){
        Result result=new Result();
        results.add(result.update(next));
    }

    public static class Result{

        private String name;
        private String indexName;
        private String index;

        public Result update(PropertyTokenizer propertyTokenizer){
            setName(propertyTokenizer.getName());
            setIndexName(propertyTokenizer.getIndexedName());
            setIndex(propertyTokenizer.getIndex());
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIndexName() {
            return indexName;
        }

        public void setIndexName(String indexName) {
            this.indexName = indexName;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Result.class.getSimpleName() + "[", "]")
                    .add("name='" + name + "'")
                    .add("indexName='" + indexName + "'")
                    .add("index='" + index + "'")
                    .toString();
        }
    }

    public static void main(String[] args) {
        String[] testData=new String[]{
                "a.b",
                "a[1]",
                "a",
                "a[1].b"
        };

        PropertyTokenizers propertyTokenizer=new PropertyTokenizers();
        for (String testString:testData) {
            propertyTokenizer.tokenizer(testString);
            propertyTokenizer.showAllResults();
        }
    }
}
