/////////////////////////////////////////////////////////////////
// Author: Sergio Santillana
////////////////////////////////////////////////////////////////

function getItemsAt(arr, par){
    const nextArray = new Array();
    const outputArray = new Array();

    // Push all the elements except for the first 2
    for(let i = 2; i < arr.length; i++){
        nextArray.push(arr[i]);
    }
    
    // Even array
    if((arr.length % 2) == 0) {
    
        // Push second element if odd, first if even
        if(par == "odd") {
      	    outputArray.push(arr[1]);
        } else {
      	    outputArray.push(arr[0]);
        }
    
    } else {
        // Push first element if odd, second if even
        if(par == "odd") {
      	    outputArray.push(arr[0]);
        } else {
            outputArray.push(arr[1]);
        }
      
    }

    // Keep calling recursive function as long as array length is greater than 2
    if (arr.length > 2){
        outputArray.push(getItemsAt(nextArray, par));
    }

    return outputArray;
}

// Tests
const array1 = getItemsAt([2, 4, 6, 8, 10], "odd");
console.log("Array [2, 4, 6, 8, 10]: " + array1);

const array2 = getItemsAt(["E", "D", "A", "B", "I", "T"], "even");
console.log("Array [E, D, A, B, I, T]: " + array2);

const array3 = getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"], "even");
console.log("Array [), (, *, &, ^, %, $, #, @, !]: " + array3);

const array4 = getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even");
console.log("Array [A, R, B, I, T, R, A, R, I, L, Y]: " + array4);