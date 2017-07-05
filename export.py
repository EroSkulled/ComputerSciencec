import json
import os
import re
import pyrebase
file = []
fd = []
cwd = os.getcwd()
for (dirpath, dirnames, filenames) in os.walk(cwd):
    for files in filenames:
        if re.search('java', files):
            if files != "Main.java":
                file.append([os.path.join(dirpath, files), files])
for f, i in zip(file, range(len(file))):
    fr = open(f[0],encoding='utf-8').read()
    fd.append({
        "content": "" + fr,
        "name":f[1],
        "index": i
    })
# # open('Firebase/public/Script/exported.js', 'w', encoding='utf-8').write("answerKey = " + json.dumps(fd, indent=4, sort_keys=True))
config = {
    "apiKey": "AIzaSyBB6a97hCn_w6Ph7ZSfTtR_vSjL_PGEaXg",
    "authDomain": "boomshakalaka-add0e.firebaseapp.com",
    "databaseURL": "https://boomshakalaka-add0e.firebaseio.com/",
    "storageBucket": "boomshakalaka-add0e.appspot.com",
    "serviceAccount": "boomshakalaka-add0e-firebase-adminsdk-84gk2-94290f4bc8.json"
}

firebase = pyrebase.initialize_app(config)

db = firebase.database()
print(db.child('answerKey').set(fd))

print(fd)
