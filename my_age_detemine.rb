require 'date'
puts ("Enter your DOB: ")
user_dbo=gets.to_i
user_age=Time.now.year-user_dbo
Array arr = user_age
str= "Yes"
p arr[0].to_s+str

