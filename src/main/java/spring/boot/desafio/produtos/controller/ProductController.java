package spring.boot.desafio.produtos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import spring.boot.desafio.produtos.dto.ProductDto;
import spring.boot.desafio.produtos.pagination.PageResponse;
import spring.boot.desafio.produtos.services.ProductService;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public PageResponse<ProductDto> list(Pageable pageable) {
        return service.list(pageable);
    }
}
