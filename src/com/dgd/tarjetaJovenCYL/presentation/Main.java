package com.dgd.tarjetaJovenCYL.presentation;

import com.dgd.tarjetaJovenCYL.domain.CompanyRepository;
import com.dgd.tarjetaJovenCYL.domain.PromotionRepository;
import com.dgd.tarjetaJovenCYL.domain.ShoppingRepository;
import com.dgd.tarjetaJovenCYL.domain.UserRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Company;
import com.dgd.tarjetaJovenCYL.domain.models.Promotion;
import com.dgd.tarjetaJovenCYL.domain.models.Shopping;
import com.dgd.tarjetaJovenCYL.domain.models.User;
import com.dgd.tarjetaJovenCYL.domain.usecase.*;

public class Main {
    public static void main(String[] args) {

        CompanyRepository companyRepository = null;

        Company company1 = new Company();
        company1.setId(1);
        company1.setCif("15423647I");
        company1.setName("Burguer King");

        AddCompanyUseCase addCompanyUseCase = new AddCompanyUseCase(companyRepository);
        addCompanyUseCase.execute(company1);

        Company company2 = new Company();
        company1.setId(2);
        company1.setCif("78123956U");
        company1.setName("Foster's Holliwood");

        addCompanyUseCase.execute(company2);

        PromotionRepository promotionRepository = null;

        Promotion promotion1 = new Promotion();
        promotion1.setId(1);
        promotion1.setTitle("Rebajas");
        promotion1.setDescription("Rebajas verano");
        promotion1.setDiscount(50);
        promotion1.setCompany(company1);

        AddPromotionUseCase addPromotionUseCase = new AddPromotionUseCase(promotionRepository);
        addPromotionUseCase.execute(promotion1);

        Promotion promotion2 = new Promotion();
        promotion2.setId(2);
        promotion2.setTitle("Rebajas");
        promotion2.setDescription("Rebajas invierno");
        promotion2.setDiscount(70);
        promotion2.setCompany(company2);

        addPromotionUseCase.execute(promotion2);

        UserRepository userRepository = null;

        User user1 = new User();
        user1.setNif("65823459A");
        user1.setName("Álvaro");
        user1.setSurnames("García Jiménez");
        user1.setAddress("Avenida Juan Carlos I, Nº26, 2ºB");

        AddUserUseCase addUserUseCase = new AddUserUseCase(userRepository);
        addUserUseCase.execute(user1);

        User user2 = new User();
        user2.setNif("45321875H");
        user2.setName("Laura");
        user2.setSurnames("Carrera López");
        user2.setAddress("Calle Agustín Rodríguez Sahagún, Nº25, 3ºA");

        addUserUseCase.execute(user2);

        ShoppingRepository shoppingRepository = null;

        Shopping shopping1 = new Shopping();
        shopping1.setId(1);
        shopping1.setDate("21/02/2022");
        shopping1.setUser(user1);
        shopping1.setPromotion(promotion1);

        AddShoppingUseCase addShoppingUseCase = new AddShoppingUseCase(shoppingRepository);
        addShoppingUseCase.execute(shopping1);

        Shopping shopping2 = new Shopping();
        shopping2.setId(2);
        shopping2.setDate("15/06/2022");
        shopping2.setUser(user2);
        shopping2.setPromotion(promotion2);

        addShoppingUseCase.execute(shopping2);

        System.out.println("PROMOCIONES");
        System.out.println("-----------");
        System.out.println(user1.getName() + " dispone de las siguientes promociones:");
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(promotionRepository);
        getPromotionsUseCase.execute();

        System.out.println("COMPRAS");
        System.out.println("-------");
        System.out.println("El usuario " + user1.getName() + " " + user1.getSurnames() + " ha realizado una compra el día "
                + shopping1.getDate() + " con la promoción " + promotion1.getTitle() + " con un descuento del " + promotion1.getDiscount()
                + "% de la empresa " + promotion1.getCompany().getName() + ", la compra llegará al domicilio " + user1.getAddress() + " en una semana aproximadamente.");
        System.out.println("El usuario " + user2.getName() + " " + user2.getSurnames() + " ha realizado una compra el día "
                + shopping2.getDate() + " con la promoción " + promotion2.getTitle() + " con un descuento del " + promotion2.getDiscount()
                + "% de la empresa " + promotion2.getCompany().getName() + ", la compra llegará al domicilio " + user2.getAddress() + " en una semana aproximadamente.");
    }
}