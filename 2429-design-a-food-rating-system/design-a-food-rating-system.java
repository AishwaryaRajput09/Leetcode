class FoodRatings {
    private class Food{
        private int rating;
        private String name;
        private String cuisine;
        Food(String name, String cuisine, int rating){
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

        Map <String,PriorityQueue<Food>> cuisineMap = new HashMap<>();
        Map<String,Food> menu = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length;i++){
            Food f = new Food(foods[i],cuisines[i],ratings[i]);
            cuisineMap.putIfAbsent(cuisines[i],new PriorityQueue<>((a,b)->
            b.rating==a.rating ? a.name.compareTo(b.name) : b.rating-a.rating));
            PriorityQueue<Food> pq = cuisineMap.get(cuisines[i]);
            pq.add(f);
            menu.put(foods[i],f);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food curr = menu.get(food);
        PriorityQueue<Food> pq = cuisineMap.get(curr.cuisine);
        pq.remove(curr);
        curr.rating = newRating;
        pq.add(curr);

    }
    
    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).peek().name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */