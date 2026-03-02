using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace SimpleCurrencyConverter
{
    public partial class Form1 : Form
    {
        List<string> currencies = new List<string>()
    {
        "PHP",
        "USD",
        "EUR",
        "CAD"
    };
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            comboBox1.Items.AddRange(currencies.ToArray());
            comboBox2.Items.AddRange(currencies.ToArray());
            comboBox1.SelectedIndex = 0;
            comboBox2.SelectedIndex = 0;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            double amount;

            if (!double.TryParse(textBox1.Text, out amount))
            {
                MessageBox.Show("Enter valid amount.");
                return;
            }

            string from = comboBox1.SelectedItem.ToString();
            string to = comboBox2.SelectedItem.ToString();

            double rate = GetRate(from, to);
            double converted = amount * rate;


            string symbol = "";

            if (to == "USD") symbol = "$";
            else if (to == "PHP") symbol = "₱";
            else if (to == "EUR") symbol = "€";
            else if (to == "CAD") symbol = "C$";

            label12.Text = symbol + converted.ToString("N2");

            this.label9.Text = amount.ToString();
            this.label10.Text = comboBox1.SelectedItem.ToString();
            this.label11.Text = comboBox2.SelectedItem.ToString();
            label12.Text = converted.ToString("N2");
        }
        

        private double GetRate(string from, string to)
        {
            if (from == to)
                return 1;

            if (from == "PHP" && to == "USD") return 0.018;
            if (from == "USD" && to == "PHP") return 55;

            if (from == "PHP" && to == "EUR") return 0.016;
            if (from == "EUR" && to == "PHP") return 60;

            if (from == "PHP" && to == "CAD") return 0.024;
            if (from == "CAD" && to == "PHP") return 42;

            if (from == "USD" && to == "EUR") return 0.90;
            if (from == "EUR" && to == "USD") return 1.10;

            if (from == "USD" && to == "CAD") return 1.35;
            if (from == "CAD" && to == "USD") return 0.74;

            if (from == "EUR" && to == "CAD") return 1.48;
            if (from == "CAD" && to == "EUR") return 0.68;

            return 1;
        }

        

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string selected = comboBox1.SelectedItem.ToString();

            comboBox2.Items.Clear();
            comboBox2.Items.AddRange(currencies.ToArray());
            comboBox2.Items.Remove(selected);
        }
    }
}
