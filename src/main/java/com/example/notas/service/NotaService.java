package com.example.notas.service;

import com.example.notas.controller.dto.NotaResponse;
import com.example.notas.dataprovider.model.NotaEntity;
import com.example.notas.dataprovider.repository.NotaRepository;
import com.example.notas.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    private final NotaRepository repository;

    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    public List<NotaResponse> encontraTodasNotas() {
        try {
            List<NotaResponse> responses = new ArrayList<>();
            List<NotaEntity> notaEntity = repository.findAll();
            for (NotaEntity entity : notaEntity) {
                responses.add(new NotaResponse(
                        entity.getTitulo(),
                        entity.getNota(),
                        entity.getDateTime()
                ));
            }

            return responses;

        } catch (Exception e) {
            throw new NotFoundException(e.getMessage());
        }
    }
}
