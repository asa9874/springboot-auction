package com.example.auction;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.Auction;
import com.example.model.AuctionUser;
import com.example.model.Item;
import com.example.repository.AuctionRepository;
import com.example.repository.AuctionUserRepository;
import com.example.repository.ItemRepository;

@SpringBootTest

class AuctionApplicationTests {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	AuctionUserRepository auctionUserRepository;

	@Autowired
	AuctionRepository auctionRepository;

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
	void auctionUserLoad() {
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

	@Test
	void auctionLoad(){
		Item item = Item.builder()
			.imgurl("testurl")
			.name("testAuctionitem")
			.description("It's just test")
			.build();
		itemRepository.save(item);

		AuctionUser user = AuctionUser.builder()
			.email(null)
			.item(null)
			.money(null)
			.password(null)
			.usernickname("홍길동테스트")
			.build();
		auctionUserRepository.save(user);

		for (int i = 0; i < 100; i++) {
            Auction auction = new Auction();
			auction.setAuctionDate(LocalDateTime.now());
			auction.setAuctionPrice(10000);
			auction.setAuctionuser(user);
			auction.setItem(item);
			auction.setItemCount(99);
            auctionRepository.save(auction);
        }
	}


}
