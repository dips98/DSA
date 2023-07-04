package Collections;


// Collections are inbuild classes, Interface and Methhod which can be dynamic and store different type of data in large numbers


public class CollectionFrame {
    public static void main(String[] args) {
        System.out.println("Collection frameworks! ");
    }

    // Collection Hierarchy 


    // parent          "Interable"                                                          |
    //                        `'->                                                          |
    // Parent Interface        "Collection"                                                 |
    //                              `'->                                                    |------> This all Interface extends from parent "Interable" up to "Sorted Set"
    //                 /--------------------/------------------------/                      |
    // Interface :  1. "List"         2. "Queue"               3. "Set"                     |
    //                                     `'->                     `'->                    |
    //                                       Deque Interface           Sorted Set           |    
}
