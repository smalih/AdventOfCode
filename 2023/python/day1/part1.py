calibration_val = 0

with open('input.txt', 'r') as input_file:
    lines = input_file.readlines()
    for line in lines:
        for i in range(len(line)):
            if line[i].isdigit():
                digit1 = int(line[i])
                break
        for i in range(len(line)-1, -1, -1):
            if line[i].isdigit():
                digit2 = int(line[i])
                break

        total = (10*digit1) + digit2
        calibration_val+=total
print(calibration_val)