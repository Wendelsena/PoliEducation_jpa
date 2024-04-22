package com.polieduca.br.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.polieduca.br.entities.Category;
import com.polieduca.br.entities.Order;
import com.polieduca.br.entities.Product;
import com.polieduca.br.entities.User;
import com.polieduca.br.entities.enums.OrderStatus;
import com.polieduca.br.repositories.CategoryRepository;
import com.polieduca.br.repositories.OrderRepository;
import com.polieduca.br.repositories.ProductRepository;
import com.polieduca.br.repositories.UserRepository;

// serve para o database seeding
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Books");
		Category cat2 = new Category(null, "Glossary");
		Category cat3 = new Category(null, "Notices");
		Category cat4 = new Category(null, "Courses"); 
		
		Product p1 = new Product(null, "Democracia: Conceitos e Princípios", "Um guia abrangente sobre os princípios fundamentais da democracia e seu papel na sociedade moderna.", 49.99, "", true);
		Product p2 = new Product(null, "Política para Iniciantes: Um Curso Prático", "Aprenda os conceitos básicos da política de uma forma acessível e descomplicada, com exemplos do dia a dia.", 29.99, "", false);
		Product p3 = new Product(null, "Estrutura e Funcionamento do Estado", "Este curso explora a organização e o funcionamento do Estado, incluindo os poderes Executivo, Legislativo e Judiciário.", 39.99, "", false);
		Product p4 = new Product(null, "Democracia", "Um regime político no qual o poder é exercido pelo povo, seja diretamente ou por meio de representantes eleitos.", 0.0, "", true);
		Product p5 = new Product(null, "MST", "Movimento dos Trabalhadores Rurais Sem Terra: um movimento social que luta pela reforma agrária e pela justiça social no campo.", 0.0, "", true);
		Product p6 = new Product(null, "Noticias Diarias", "True News", 0.0, "", true);

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
