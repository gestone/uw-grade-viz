import csv

transformed_file = open('transformed_data.csv', 'w')
header = "Year,Quarter,Course_Number,Course_Title,Primary_Instructor,Student_Count,A,A-,B+,B,B-,C+,C,C-,D+,D,D-,F,W,Average_GPA"
transformed_file.write(header)
transformed_file.write("\n")

with open('data.csv', 'rb') as csvfile:
    data = csv.reader(csvfile, delimiter=',')
    for row in data:
        [quarter, year] = [x.replace('(', '').replace(')', '') for x in row[1].split()[1:]]
        row[1] = year.strip()
        row.insert(2, "'" + quarter.strip() + "'")

        class_name = "'" + row[3].strip().replace(",", "") + "'"
        row[3] = class_name

        course_name = "'" + row[4].strip().replace(",", "") + "'"
        row[4] = course_name

        instructor = "'" + row[5].strip().replace(",", "") + "'"
        row[5] = instructor

        row = ['0' if x == '' else x for x in row]

        transformed_file.write(",".join(row[1:]))
        transformed_file.write("\n")

transformed_file.close()
