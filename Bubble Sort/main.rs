fn main(){
    let mut arr: [u32;10] = [10,8,9,7,6,5,3,2,0,1];
    bubble_Sort(&mut arr);
    println!("{:?}",arr);
}
fn bubble_Sort(arr: &mut [u32;10]){
    let mut temp: u32;

    for i in 0..arr.len(){
        for j in 0..(arr.len() - 1 - i){
            if arr[j] < arr[j+1]{
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
