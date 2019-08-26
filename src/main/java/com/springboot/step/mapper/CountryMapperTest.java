package com.springboot.step.mapper;

import com.springboot.step.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CountryMapperTest  extends BaseMapperTest{

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlsession();
        try{
            List<Country> list = sqlSession.selectList("mapper.CountryMapper.selectAll");
        }finally {
            sqlSession.close();
        }
    }
    private void printCountryList(List<Country> countryList){
        for(Country country:countryList){
            System.out.println(country.getId()+country.getCountryname()+country.getCountrycode());
        }
    }
}