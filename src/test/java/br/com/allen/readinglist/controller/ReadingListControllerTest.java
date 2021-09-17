package br.com.allen.readinglist.controller;

import static org.mockito.Mockito.mock;

import br.com.allen.readinglist.repository.ReadingListRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {ReadingListController.class})
@ExtendWith(SpringExtension.class)
class ReadingListControllerTest {
    @Autowired
    private ReadingListController readingListController;

    @MockBean
    private ReadingListRepository readingListRepository;

    @Test
    void testAddToReadingList() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/reader");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.readingListController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(500));
    }

    @Test
    void testReadersBook() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/reader");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.readingListController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(500));
    }
}

