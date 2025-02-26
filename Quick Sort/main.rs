fn main(){
    let mut arr = vec![3,2,1,0,6,5,4,8,7,9,10];
    
    println!("Array: {:?}",arr);
    
    let size = arr.len();
    quick_sort(&mut arr,0,size-1);
    
    println!("Sorted Array: {:?}",arr);
}
fn quick_sort(arr: &mut Vec<usize>, left: usize, right: usize){
    if left < right{
        let pi = partition(arr,left,right);
        if pi > 0{
            quick_sort(arr,left,pi-1);
        }
        quick_sort(arr,pi+1,right);
    }
}
fn partition(arr: &mut Vec<usize>, left: usize, right: usize) -> usize{
    let pivot = arr[right];
    let mut i = left;
    
    for j in left..right{
        if arr[j] < pivot{
            arr.swap(j,i);
            i += 1;
        }
    }
    arr.swap(right,i);
    return i;
}