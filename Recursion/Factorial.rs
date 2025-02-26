fn main(){
    let b: i16 = 4;
    let result = factorial(b);
    
    println!("{}! = {}",b,result);
}
fn factorial(b: i16) -> i16{
    if b == 0 { return 1;}
    
    return factorial(b-1) * b;
}