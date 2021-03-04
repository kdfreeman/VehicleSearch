//package com.kapilfreeman.vehiclesearch.service;
//
//import javax.persistence.AttributeConverter;
//import javax.persistence.Converter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//@Converter
//public class StringToListConverter implements AttributeConverter<List<String>, String> {
//    @Override
//    public String convertToDatabaseColumn(List<String> list) {
//        if(list==null)
//            return null;
//        return String.join(",", list);
//    }
//
//    @Override
//    public List<String> convertToEntityAttribute(String joined) {
//        if(joined==null)
//            return null;
//        return new ArrayList<>(Arrays.asList(joined.split(",")));
//    }
//}
