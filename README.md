# ProductProcessing
I create a CRUD REDIS REST project.

I create this Redis CRUD Rest project, we are able to add new products with product name, expiration date, price, currency, active passive state.
All this information stored into the database, and we can view on the  products list.
Meantime also we can use cache memory to create new products as a draft and we can use some of the crud actions on it. If we want we can send this
draft to the database list to use it there. If we don't use draft for 40 minutes draft will be automatically deleted from cache memory.
I send the project with rar.
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

And products will get deleted from cache memor after sending to the database. If nobody touch the product in cache memory product wil get deleted after 40 minutes.