use master

/*create table Product(Cust Varchar(25), Prod Varchar(25), QTY int)

select * from Product

Insert into Product(Cust,Prod,QTY) values('Laks', 'Milk', 3)

Insert into Product(Cust,Prod,QTY) values('Shruthi' , 'Chocolate', 5)

Insert into Product(Cust,Prod,QTY) values('Laks', 'Egg', 3)

Insert into Product(Cust,Prod,QTY) values('Shruthi' , 'Croissant', 5)

Insert into Product(Cust,Prod,QTY) values('Sanjay', 'Books', 2)

Insert into Product(Cust,Prod,QTY) values('Sanjay' , 'Chocolate', 6)

Insert into Product(Cust,Prod,QTY) values('Lakshmi', 'Books', 5) */



select Prod,Lakshmi,Shruthi,Sanjay 
from (select Cust,Prod,QTY from Product) up
Pivot (sum(QTY) for Cust in(Lakshmi,Shruthi,Sanjay)) as pvt order by Prod


select * from Product 

pivot(sum(QTY) for Prod in (Chocolate,Milk,Egg,Croissant,Books)) as ProPivot