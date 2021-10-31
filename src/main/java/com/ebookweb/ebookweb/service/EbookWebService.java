package com.ebookweb.ebookweb.service;

import com.ebookweb.ebookweb.domain.EbookWeb;
import com.ebookweb.ebookweb.repository.EbookWebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EbookWebService {

    @Autowired
    EbookWebRepository ebookWebRepository;

    public void criarLead(EbookWeb ebookWeb){
        ebookWebRepository.save(ebookWeb);
    }

    public Iterable<EbookWeb> exibirPageEbook(){
        return ebookWebRepository.findAll();
    }
}
