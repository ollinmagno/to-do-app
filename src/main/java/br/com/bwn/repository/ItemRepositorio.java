package br.com.bwn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.bwn.model.Item;

@NoRepositoryBean
public interface ItemRepositorio extends JpaRepository<Item, Long>{
	Item findById(long id);
}