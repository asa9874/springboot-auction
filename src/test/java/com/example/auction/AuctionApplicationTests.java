package com.example.auction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Item;
import com.example.repository.ItemRepository;

@SpringBootTest

class AuctionApplicationTests {

	@Autowired
	ItemRepository itemRepository;

	@Test
	void itemLoad() {
		for (int i = 0; i < 100; i++) {
            Item item1 = new Item();
            item1.setImgurl("http://example.com/image" + i + ".jpg");
            item1.setName("Item " + i);
            item1.setDescription("Description for Item " + i);
            itemRepository.save(item1);
        }
	}

}
