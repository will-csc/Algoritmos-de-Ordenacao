fn main(){
    let mut arr: [i32;11] = [3,2,1,0,5,4,6,8,7,10,9];
    println!("Array: {:?}",arr);

    insertionsort(&mut arr);
    println!("Sorted Array: {:?}",arr);
}
fn insertionsort(arr: &mut [i32;11]){
    let size = arr.len();

    for i in 1..size{
        let temp = arr[i];
        let mut j = i - 1;

        while arr[j+1] < temp {
            arr[j] = arr[j+1];
            j -= 1;
        }
        arr[j+1] = temp;
    }
}
