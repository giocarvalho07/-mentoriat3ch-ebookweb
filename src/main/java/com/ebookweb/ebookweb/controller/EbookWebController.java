package com.ebookweb.ebookweb.controller;

import com.ebookweb.ebookweb.domain.EbookWeb;
import com.ebookweb.ebookweb.service.EbookWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EbookWebController {

    @Autowired
    EbookWebService ebookWebService;

    @GetMapping("/mT3ch-ebook-web")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-ebook-web")
    public String cadastrarEbook(EbookWeb ebookWeb) {
        ebookWebService.criarLead(ebookWeb);
        return "pages/ebook";
    }


    @GetMapping("/mT3ch-receber-ebook-web")
    public ModelAndView receberEbook() {
        ModelAndView model = new ModelAndView("pages/ebook");
        Iterable<EbookWeb> ebook = ebookWebService.exibirPageEbook();
        model.addObject("ebook", ebook);
        return model;
    }
}
