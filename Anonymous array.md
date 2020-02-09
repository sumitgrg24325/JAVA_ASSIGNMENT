# ANONYMOUS ARRAY:

In JAVA you can create an array without specifying any name such arrays are known as anonymous arrays. Since it doesn’t have name to refer you can use it only once in your program. Generally, anonymous arrays are passed as arguments to methods.

You can create an anonymous array by initializing it at the time of creation.

new int[] { 1254, 5452, 5743, 9984}; //int array

new String[] {"Java", "JavaFX", "Hadoop"}; //String array

    An array in Java without any name is called anonymous array.It is created for using instantly.It is passed as argument of method.

## Syntax:
* new int[] {1,2,3} //anonymous int array
* new String[] {'hello', 'world'}

## Example:
```javascript
class Test { 
    public static void main(String[] args) 
    { 
          // anonymous array 
          sum(new int[]{ 1, 2, 3 }); 
    } 
    public static void sum(int[] a) 
    { 
        int total = 0; 
  
        // using for-each loop 
        for (int i : a)  
            total = total + i; 
          
        System.out.println("The sum is:" + total); 
    } 
} 
```
### output:
The sum is 6