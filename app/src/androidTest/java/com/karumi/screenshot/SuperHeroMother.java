package com.karumi.screenshot;

import com.karumi.screenshot.model.SuperHero;
import com.karumi.screenshot.model.SuperHeroBuilder;

/**
 * Created by arias on 28/07/17.
 */

public class SuperHeroMother {
    public static SuperHero regularSuperHero(){
        return new SuperHeroBuilder().setName("Superman").setPhoto(null).setIsAvenger(true).setDescription("Superman is the best").createSuperHero();

    }

    public static SuperHero bigTitleHero(){
        return new SuperHeroBuilder().setName("Superman Man Man Man Man Man Man Man Man Man Man Man Man Man Man Man").setPhoto(null).setIsAvenger(true).setDescription("Superman is the best").createSuperHero();
    }

    public static SuperHero NoTitleHero(){
        return new SuperHeroBuilder().setName("").setPhoto(null).setIsAvenger(true).setDescription("Superman is the best").createSuperHero();
    }

    public static SuperHero NoDescriptionHero(){
        return new SuperHeroBuilder().setName("Superman").setPhoto(null).setIsAvenger(true).setDescription("").createSuperHero();
    }

    public static SuperHero LongDescriptionHero(){
        return new SuperHeroBuilder().setName("Superman").setPhoto(null).setIsAvenger(true).setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce egestas nisi et efficitur iaculis. Quisque pharetra rhoncus tellus, ac dictum elit bibendum vitae. Donec aliquam, massa sed dignissim pulvinar, tortor turpis tincidunt libero, ut dignissim nunc lectus sed libero. Suspendisse eget elit tristique, fermentum risus vel, porttitor purus. Integer lobortis sapien metus, id iaculis lectus suscipit nec. Sed non urna iaculis, condimentum est a, commodo magna. Nunc ut consequat lectus.\n" +
                "\" +\n" +
                "            \"\\n\" +\n" +
                "            \"Fusce pellentesque, mi eget aliquam facilisis, risus ex molestie massa, a viverra libero sapien at dui. Mauris faucibus nibh malesuada, tempor augue et, placerat magna. Duis hendrerit massa sit amet viverra rhoncus. Pellentesque id eleifend lacus, porta bibendum ipsum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam auctor mi in ex condimentum, et cursus elit porta. Vivamus consectetur ligula metus, non volutpat leo pretium eget. Sed non tempor ex, ac sollicitudin mauris. Quisque quis cursus metus.\\n\" +\n" +
                "            \"\\n\" +\n" +
                "            \"Morbi sed diam a orci blandit efficitur a et risus. Nunc convallis ligula in massa accumsan rhoncus. Etiam congue libero vel sem semper luctus. Suspendisse leo dui, tempor maximus egestas sit amet, accumsan nec neque. Praesent porta placerat nisi, faucibus tempor ipsum tristique sit amet. Nulla nunc urna, ultricies vel purus a, suscipit mattis elit. Aliquam consectetur mauris nec neque suscipit, vitae sollicitudin lacus tempus.\")").createSuperHero();
    }

}
