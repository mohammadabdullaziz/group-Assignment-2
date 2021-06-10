package com.example.shoppingcart.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shoppingcart.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Trouser", 80, true, "https://imcut.jollychic.com//uploads/jollyimg/gallery/201806/01/IL20180601174808416.jpg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Short", 50, true, "https://e7.pngegg.com/pngimages/797/258/png-clipart-adidas-shorts-kit-football-sport-adidas-sport-sporting-goods.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "Socks", 30, false, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT493HHKqKFldViFpuUqFLcOh7EcYdAyg27Vw&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Shoe", 54, true, "https://1.bp.blogspot.com/-Qqe2G4-yEWA/XgdWps4YSOI/AAAAAAAAEBk/jnvH4Y9PmSsf-cENfPQqPvboKEgSlVvhQCLcBGAsYHQ/s1600/71PexzKajZL._UL1500_.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Helmet", 55, true, "https://c0.klipartz.com/pngpicture/377/929/gratis-png-boxeo-y-sombreros-de-artes-marciales-ropa-adidas-taekwondo-adidas.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "Ball", 99, true, "https://cdn.salla.sa/iW35oUZVESuNplIHZDutlVBeXV9VLUb4fWtAgQ7h.jpeg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Racket", 35, false, "https://ageb.net/wp-content/uploads/2019/07/3818.png"));
        productList.add(new Product(UUID.randomUUID().toString(), "T-shirt", 64, true, "https://cdn.shopify.com/s/files/1/0246/8829/6000/products/bazarcom_0c7ca324-f65f-4fb0-9765-ce1b936eb9b1_700x.jpg?v=1587396098"));
        productList.add(new Product(UUID.randomUUID().toString(), "Gloves", 100, true, "https://media.zid.store/thumbs/4dc4bd52-bafa-41b3-9c22-e3df236a340a/6bd9520a-5976-46fb-8d64-a5730a826b9b-thumbnail-370x370-70.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Dumbbell", 10, true, "https://images-na.ssl-images-amazon.com/images/I/51OsfSrR49L._AC_SY780_.jpg"));
        mutableProductList.setValue(productList);
    }
}
