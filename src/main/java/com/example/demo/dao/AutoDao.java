package com.example.demo.dao;

import com.example.demo.model.ResponseAutoDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoDao extends CrudRepository<ResponseAutoDto, String> {
}
