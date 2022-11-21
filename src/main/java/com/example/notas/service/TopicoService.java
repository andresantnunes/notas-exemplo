package com.example.notas.service;


import com.example.notas.controller.dto.TopicoResponse;
import com.example.notas.dataprovider.model.TopicoEntity;
import com.example.notas.dataprovider.repository.TopicoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicoService {

    private final TopicoRespository respository;

    public TopicoService(TopicoRespository respository) {
        this.respository = respository;
    }

    public List<TopicoEntity> encontraTopicos() {
        List<TopicoEntity> response = respository.findAll();
        return response;
    }
}
