package com.example.auction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.AuctionUser;
import com.example.model.Item;
import com.example.repository.AuctionUserRepository;
import com.example.repository.ItemRepository;

@SpringBootTest

class AuctionApplicationTests {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	AuctionUserRepository auctionUserRepository;

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
	
	@Test
	void userLoad() {
		for (int i = 0; i < 100; i++) {
            AuctionUser user1 = new AuctionUser();
            user1.setEmail("email"+i);
			user1.setItem(null);
			user1.setMoney(10000);
			user1.setPassword("qwer"+i);
			user1.setUserid("qweqweq"+i);
			user1.setUsernickname("홍길동"+i);
            auctionUserRepository.save(user1);
        }
	} 


}
