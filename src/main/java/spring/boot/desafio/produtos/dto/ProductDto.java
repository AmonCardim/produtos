package spring.boot.desafio.produtos.dto;

import java.math.BigDecimal;

import spring.boot.desafio.produtos.model.Product;

public record ProductDto(
    String name,
    BigDecimal price
) {
    public static ProductDto from(Product p) {
        return new ProductDto(p.getName(), p.getPrice());
    }
}
