package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.States;
import com.example.demo.repository.StateRepository;
import com.example.demo.service.StateServiceImpl;
@SpringBootTest
class StateServiceTest {
	
	@Mock
	private StateRepository repo;
	
	@InjectMocks
	private StateServiceImpl service;
	
	private States states;
	private List<States> list;
	
	@BeforeEach
	public void setup() {
//		List<States> list = new ArrayList<>();
//		list.add(new States("Texas","TX","South"));
//		list.add(new States("California","CA","West"));
//		list.add(new States("Arizona","AZ","Southwest"));
	}

	@Test
	void testFindAllStates() throws Exception{
		List<States> list = new ArrayList<>();
		list.add(new States("Texas","TX","South"));
		list.add(new States("California","CA","West"));
		list.add(new States("Arizona","AZ","Southwest"));
		
		when(repo.findAll()).thenReturn(list);
		List<States> list2 = repo.findAll();
		assertEquals(3, list2.size());
	}
	
	@Test
	void testFindAllStatesException() throws Exception{
		List<States> list = new ArrayList<>();
		when(repo.findAll()).thenReturn(list);
		Exception exception = Assertions.assertThrows(Exception.class, ()-> service.findAllStates());
		assertEquals("List is empty.", exception.getMessage());
	}

	@Test
	void testFindByName() throws Exception {
		when(repo.findById("California")).thenReturn(Optional.of(new States("California","CA","West")));
		States state = repo.findById("California").orElseThrow( ()->new Exception("State not found.") );
		assertEquals(new States("California","CA","West"), state);
	}
	
	@Test
	void testFindByNameException() throws Exception {
		when(repo.findById("Calif")).thenReturn(Optional.empty());
		Exception exception = Assertions.assertThrows(Exception.class, ()-> service.findByName("Calif"));
		assertEquals("State not found.", exception.getMessage());
	}

}
