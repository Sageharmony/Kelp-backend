package com.kelp.kelpbackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger( LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(LocationRepository repository) {

        return args -> {
          
            log.info("Preloading" + repository.save(new Location("Never Coffee", "Coffee and distinctive drinks", "chat with friends", "45.51676590676761", "-122.61889382393758", "7am to 4pm everyday", false, "outdoor seating", "https://www.designsponge.com/wp-content/uploads/2018/11/never1.jpg", 5)));

            log.info("Preloading" + repository.save(new Location("Clinton Street Coffeehouse", "Cheerful locally roasted coffee, tea, and treats", "study/chat with friends", "45.50354018573836", "-122.63943760488462", "7am to 5pm everyday", false, "yes", "https://cdn.workfrom.co/files/2016/01/kf-clinton1-1160x870.jpg", 7)));
            
            log.info("Preloading" + repository.save(new Location("CC Slaughters Nightclub and Lounge", "Energetic gay club", "dance", "45.524757508047216", "-122.67284146255564", "Mon-Wed: 5pm to 12am, Thurs-Sat: 3pm to 2am, Sun: 2pm to 2am", true, "yes", "https://media.them.us/photos/5fdcec30379edbf5e663e36b/master/w_1600%2Cc_limit/cc-slaughters_inline.jpg", 3)));

            log.info("Preloading" + repository.save(new Location("Homegrown Smoker", "Vegan BBQ plates and Southern soul food favorites", "chat with friends", "45.590524310946265", "-122.75500541467463", "Wed-Sun: 11am to 8pm", true, "yes", "https://res.cloudinary.com/sagacity/image/upload/c_crop,h_1000,w_1500,x_0,y_0/c_limit,dpr_auto,f_auto,fl_lossy,q_80,w_1080/HGS-1_s0swwb.jpg", 10)));
            
            log.info("Preloading" + repository.save(new Location("Ben & Esther’s Vegan Jewish Deli", "Vegan classic Jewish deli with bagels, sandwiches, and more", "grab and go", "45.55911769704503", "-122.64672286626075", "7am to 7pm everyday", false, "no", "https://i0.wp.com/whtnwmg.sfo2.cdn.digitaloceanspaces.com/wp-content/uploads/sites/5/2022/05/BenandE.jpg", 10)));
        
            
            log.info("Preloading" + repository.save(new Location("Fern Bar", "Bar-focused restaurant with handcrafted cocktails and ample plants for atmosphere", "chat with friends/date night", "38.403320250962125", "-122.82117120673746", "Mon-Tues: 5pm to 9pm, Wed-Fri: 11:30am to 3pm and 5pm to 9pm, Sat-Sun: 11am to 3pm and 5pm to 9pm", true, "yes", "https://images.squarespace-cdn.com/content/v1/5c01f2ce96d4559d237e1004/1549487407500-9TPLHPRZ24BGI3HGFNGY/03+copy.jpg", 6)));
            
            log.info("Preloading" + repository.save(new Location("Slice of Life", "Locally sourced vegetarian dishes in a quaint setting", "chat with friends/date night", "38.40385192669579", "-122.82445247604888", "Tues-Fri: 11am to 9pm, Sat-Sun: 9am to 9pm", false, "yes", "https://media-cdn.tripadvisor.com/media/photo-s/09/c1/8c/2e/photo2jpg.jpg", 8)));
            
            log.info("Preloading" + repository.save(new Location("Ramen Gaijin", "Variety of ramen noodle dishes and Japanese small plates", "chat with friends", "38.40294325961714", "-122.8238576202285", "Tues-Sat: 12pm to 2:30pm and 5pm to 9pm", true, "yes", "https://www.sonomacounty.com/sites/default/files/styles/profile_photo_full/public/listing_images/profile/4879/dining_Ramen_Gaijin_Sebastopol_by_Sierra_Downey_Sonoma_County_0020-4dcc65ca5056a36_4dcc683f-5056-a36a-076d09b0be58a4de.jpg", 4)));
            
            log.info("Preloading" + repository.save(new Location("Retrograde Coffee Roasters", "Small batch specialty coffee", "chat with friends", "38.40189227996113", "-122.82401855276882", "Thurs-Tues: 7am to 5pm", false, "yes", "https://cdn.shopify.com/s/files/1/0555/3107/7684/files/661A4142-sm_2000x.jpg", 6)));
            
            log.info("Preloading" + repository.save(new Location("Jasper’s", "Bar and lounge with specialty cocktails and diverse selections of spirits", "dance", "38.40285497788595", "-122.82349820423184", "Tues-Fri: 2pm to 2am, Sat: 12pm to 2am, Sun: 12pm to 12am", true, "yes", "https://img.restaurantguru.com/ra8d-bar-counter-Jaspers-2021-09-2.jpg", 3)));
            
            
        };
    }
}