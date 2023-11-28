Main models are User, Product and Order.
Rest models are nested models for these main models.

Nested models:
1. User has Address.
2. Product has ProductSize 
   1. Product Size denotes the product sizes (S, M, L) and their quantity
3. Order has 
   1. OrderItem - contains list of productId and its quantity.
   2. Address 
   3. OrderStatus - defined as enum, can be pending, processing, shipped, delivered, cancelled.