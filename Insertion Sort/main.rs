fn main(){
    let mut arr = [10,0,9,1,8,2,7,3,4,6,5];
    println!("Array: {:?}",arr);
    
    InsertionSort(&mut arr);
    println!("Sorted Array: {:?}",arr);
}
fn InsertionSort(arr: &mut [isize;11]){
    let size = arr.len();
    
    for i in 1..size{
        let temp = arr[i];
        let mut j = i;
        
        while j > 0 && arr[j-1] > temp {
            arr[j] = arr[j-1];
            j -= 1;
        }
        arr[j] = temp;
    }
}