# ProductProcessing
I create a project which is able to control adding product and existing product state.

I create this CRUD project, we are able to add new products with productname, expiration date, price, currency and it is have the active passive state.
All this information filling a add another product to product list that we can see on ==>  
http://localhost:8080/products ' port.
Meantime I am still working on the project to complete for rest of the desired parts.
I send the project with rar and after I complete I will send it back second time with everything completed.
Thank you for your time and consideration.

For to use application it needs to connect with  database and needs to add update application.properties options ==>

    spring.datasource.username=postgres
    spring.datasource.password=root

After Run The Program this is the DataBase processing part

You can add product on : 

    localhost:8080/products/save
    
    with
     {
    "id":7,
    "productName":"breadman",
    "expirationDate":"01/10/1995",
    "price":7,
    "moneyCurrency":"euroo",
    "active":false
    }

You can view product list :

    localhost:8080/products
You can change product active passive state :

    localhost:8080/products/update/{enter product id}

You can bring Active or passive product list separately :

    localhost:8080/products/active/{true or false option}

You can bring product by name : 

    localhost:8080/products/name/{enter product name}

Here where we work on Cache memory on Redis part

You can add product to cache memory :

    localhost:8080/productCache/save

Then enter the specified style values 

    {
    "id":7,
    "productName":"breadman",
    "expirationDate":"01/10/1995",
    "price":7,
    "moneyCurrency":"euroo",
    "active":false
    }

You can list products on cache memory by using :

    localhost:8080/productCache

You can find products on cache memory by using :

    localhost:8080/productCache/find/{enter id number}

You can send data from cache memory to database by using :

    localhost:8080/productCache/sendDB/{enter id number}


You can remove products from cache memory by using :

    localhost:8080/productCache/remove/{enter id number}

And products will get deleted from cache memor after sending to the database.