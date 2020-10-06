<?php

//compare two integers, used by both sort functions
function compare ($value1,$value2){
  return $value1 > $value2;
}

//swamp values in two adjacent array cells, used by both sort functions
function swap_values(&$arrayIn, $current_index){
  $temp = $arrayIn[$current_index];
  $arrayIn[$current_index] = $arrayIn[$current_index+1];
  $arrayIn[$current_index+1] = $temp;
}

//sort given array using insertion method
function insertion_sort(&$arrayIn){
   for ($current_index = 1; $current_index < count($arrayIn); $current_index++) {
       $value = $arrayIn[$current_index];
       $previous_index = $current_index-1;
       while ( ($previous_index > -1) && compare( $arrayIn [$previous_index], $value ) ) {
           swap_values($arrayIn, $previous_index);
           $previous_index--;
       }
   }
}

//sort given array using bubble method
function bubble_sort(&$arrayIn){
  for ($index_outer = 1; $index_outer <= count($arrayIn)-1 ; $index_outer++ ) {
    for ($index_inner = 0; $index_inner <= count($arrayIn)-2 ; $index_inner++ ) {
      if(compare($arrayIn[$index_inner], $arrayIn[$index_inner+1])){
        swap_values($arrayIn, $index_inner);
      }
    }
  }
}

$intArray = array(6,2,7,5,3,4,1);
print_r($intArray);
bubble_sort($intArray);
print_r($intArray);

$intArray = array(6,2,7,5,3,4,1);
print_r($intArray);
insertion_sort($intArray);
print_r($intArray);

?>
