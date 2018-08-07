// https://www.hackerrank.com/challenges/java-factory/problem

            Food food;
            if(order.equals("cake"))
                food = new Cake();
            else
                food = new Pizza();
            return food;