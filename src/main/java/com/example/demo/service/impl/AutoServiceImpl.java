package com.example.demo.service.impl;

import com.example.demo.dao.AutoDao;
import com.example.demo.model.ResponseAutoDto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoServiceImpl implements AutoService {
    @Autowired
    private AutoDao dao;

    public ResponseAutoDto findById(String id){
        return dao.findById(id).orElse(ResponseAutoDto.builder().build());
    }

    public ResponseAutoDto save(ResponseAutoDto request){
        return dao.save(request);
    }

    public void deleteById(String id){
        dao.deleteById(id);
    }
}
