package spring.boot.desafio.produtos.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import spring.boot.desafio.produtos.dto.ProductDto;
import spring.boot.desafio.produtos.pagination.PageResponse;
import spring.boot.desafio.produtos.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public PageResponse<ProductDto> list(Pageable pageable) {

        Pageable safe = PageRequest.of(
            pageable.getPageNumber(),
            Math.min(pageable.getPageSize(), 100) 
        );

        return PageResponse.of(repository.findAll(safe).map(ProductDto::from));
    }
}
