package com.controller;

import com.Application;
import com.controller.ProviderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContentAssert;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.domain.Provider;
import com.repo.ProviderRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="/context1.xml", classes = { Provider.class,ProviderController.class, ProviderRepository.class})
@WebMvcTest(value = ProviderController.class, secure = false)
public class ProviderTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProviderRepository pr;
	
	
	
	Provider mockProvider = new Provider(1, "rajeev", "poosa", "firstgarde", "2", "platinum");
	
	@Test
	public void findByName() throws Exception { 
		
	Mockito.when(pr.find(Mockito.anyString())).thenReturn(mockProvider);
	
	RequestBuilder rB = MockMvcRequestBuilders.get("/provider/login1?firstName=rajeev").accept(MediaType.APPLICATION_JSON);
	MvcResult result = mockMvc.perform(rB).andReturn();
	System.out.println(result.getResponse());
	String expected = "{firstName: rajeev,lastName: poosa}";
	JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	
	
		
		
	}

}
