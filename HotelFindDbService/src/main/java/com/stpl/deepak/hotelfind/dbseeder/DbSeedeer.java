package com.stpl.deepak.hotelfind.dbseeder;

import org.springframework.stereotype.Component;

@Component
public class DbSeedeer /*implements CommandLineRunner*/{
	/*@Autowired 
	HotelFindRepository hotelRepository;

	@Override
	public void run(String... args) throws Exception {
		HotelModel hotelTaj = new HotelModel("H001",
				"Taj",
				5,
				5000,
				Arrays.asList("WALLET","UPI","NETBANKING","DEBIT-CREDIT","ON-ARRIVAL"),
				false
				);
		
		HotelModel hotelMaurya = new HotelModel("H002",
				"Maurya",
				2,
				900,
				Arrays.asList("WALLET","UPI","NETBANKING","DEBIT-CREDIT"),
				false
				);
		
		HotelModel hotelChankya = new HotelModel("H003",
				"Chankya",
				2,
				800,
				Arrays.asList("WALLET","UPI","NETBANKING","DEBIT-CREDIT"),
				false
				);
		
		hotelRepository.deleteAll();
		
		List<HotelModel> hotelList = Arrays.asList(hotelTaj, hotelMaurya, hotelChankya);
		hotelRepository.saveAll(hotelList);
	}*/
}